class Solution:
    def convertDateToBinary(self, date: str) -> str:
        splitted_date = date.split('-')

        for i in range(len(splitted_date)):
            number = int(splitted_date[i])
            splitted_date[i] = bin(number)[2:]
        
        return "-".join(splitted_date)