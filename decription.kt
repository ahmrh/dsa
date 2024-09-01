import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import java.util.Base64

fun decryptAES(cipherText: String, paddingMode: String): String {
    val secretKey = "3r2Si3uc7XSgh53o".toByteArray(Charsets.UTF_8)
    val initVector = "doBiHebupO9fTkKo".toByteArray(Charsets.UTF_8)

    try {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        val keySpec = SecretKeySpec(secretKey, "AES")
        val ivSpec = IvParameterSpec(initVector)
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec)

        val decodedCiphertext = Base64.getDecoder().decode(cipherText)
        val decryptedData = cipher.doFinal(decodedCiphertext)
        return String(decryptedData, Charsets.UTF_8)
    } catch (ex: Exception) {
        println("Decryption failed with $paddingMode: ${ex.javaClass.simpleName} - ${ex.message}")
    }
    return ""
}

fun encryptAES(plainText: String): String {
    val secretKey = "3r2Si3uc7XSgh53o".toByteArray(Charsets.UTF_8)
    val initVector = "doBiHebupO9fTkKo".toByteArray(Charsets.UTF_8)

    try {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        val keySpec = SecretKeySpec(secretKey, "AES")
        val ivSpec = IvParameterSpec(initVector)
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec)

        val encryptedData = cipher.doFinal(plainText.toByteArray(Charsets.UTF_8))
        return Base64.getEncoder().encodeToString(encryptedData)
    } catch (ex: Exception) {
        println("Encryption failed: ${ex.javaClass.simpleName} - ${ex.message}")
    }
    return ""
}

fun main() {
    // Test with known plaintext
    val originalText = "Hello, World!"
    println("Original text: $originalText")

    val encryptedText = encryptAES(originalText)
    println("Encrypted text: $encryptedText")

    val decryptedText = decryptAES(encryptedText, "PKCS5Padding")
    println("Decrypted text: $decryptedText")

    // Try to decrypt the original ciphertext with different padding modes
    val originalCipherText = "/fvGjO8HkOTx1mijI2WcxA=="
    println("\nTrying to decrypt original ciphertext: $originalCipherText")

}