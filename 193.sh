//2.193 Valid Phone Numbers
method1
# Read from the file file.txt and output all valid phone numbers to stdout.
cat file.txt | grep -E "^(\([0-9]{3}\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$"

method2
# Read from the file file.txt and output all valid phone numbers to stdout.
sed -rn '/^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$/p' file.txt