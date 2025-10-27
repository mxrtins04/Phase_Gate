from random import *

def get_eligible_values(first_number, second_number):
	temp = first_number
	temp_2 = second_number
	if second_number > first_number:
			second_number = temp
			first_number = temp_2
			return first_number, second_number


	
def check_for_correct_answer(first_number, second_number, answer, score, trials):
	correct_answer = first_number - second_number
	if correct_answer == answer:
		score += 1
		return(score)
	

