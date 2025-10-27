from random import *
from functions import *

score = 0
level = 1

while( level <= 10 ):
	first_number = randrange(1, 2000) + 0
	second_number = randrange(1, 500) + 0
	if second_number > first_number:
			temp = first_number
			temp_2 = second_number
			
			second_number = temp
			first_number = temp_2
			



	correct_answer = first_number - second_number

	answer = int(input(f"What is {first_number} - {second_number}?"))
	if correct_answer == answer:
		score += 1
	else:
		answer = int(input(print("Wrong answer... You have 1 trial left for this question... Try again: ")))
	if correct_answer == answer:
		print("correct!")
		score += 1
		
	else:
		print("Wrong Answer")
		
				
			

	level += 1
print(score)
	


