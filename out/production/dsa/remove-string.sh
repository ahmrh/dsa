#!/bin/bash

# Function to remove whitespace from a string
remove_whitespace() {
    local input_string="$1"
    # Remove all whitespaces
    local output_string="${input_string//[[:space:]]/}"
    echo "$output_string"
}

# Read input from the user
echo "Enter a string:"
read input_string

# Remove whitespace and print the result
output_string=$(remove_whitespace "$input_string")
echo "String without whitespace: $output_string"

# Copy the result to the clipboard
echo -n "$output_string" | xclip -selection clipboard

echo "The result has been copied to the clipboard."