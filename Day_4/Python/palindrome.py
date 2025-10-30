def is_palindrome(words):
	new_element= words
	count = 0
	for elements in words:
		palindrome = ""
		for element in elements:
			palindrome = element + palindrome

		if elements == palindrome:
			new_element[count] = True;
		else:
			new_element[count] = False;
		count+=1
	return new_element
	
words  = ["madam", "kali", "hello", "noon"]
print(is_palindrome(words))