# Week 7 Lab
Hello guys. Sorry for late upload of week 7 lab. In this document I will explain all method I used in the lab.

## CountVowels.java
### __numberOfVowels method__
The lab ask us to count the vowels not print out them, so the first thing we do in the method is convert sentence to lowercase. Next declare variable vowels to store all vowels "aeiou" and total. For each character in the sentence, if the character exist in the vowels variable then it is a vowels, so increase total by one.

### __main method__
Just input and call numberOfVowels method.

### __Javadoc__
To create javadoc files, first create the documentation for each method.
```
/**
 * Method documentation, write anything here.
 */
public static void targetMethod() {...}
```
Next use command ```javadoc file_name.java``` to create the javadoc. To check the javadoc files, double click index.html which is created. I created folder javadoc for you to look at it.


## Calculate.java
### __isLeapYear, getDaysInMonth, getMonthName methods__
To obvious, nothing to talk about it.

### __calculateTotalDaysPassed method__
Get the total days in last months, for example: if the current month is March, then last months is January and February, which is 31+28(not leap year)=59 days. Next add the number of days in current month except the current day (day-1). Return the total.

### __printNextDay method__
If the next day number is greater than this month, then day is 1 and month++. For example the current day is 31 January, the next day is 32 January which is invalid, so the next day must be 1 and month+1 mean February. 

Next check if the next month > 12 then month=1 and year++. For example the current day is Dec 31 2021, the next day is Dec 32, which is invalid so it must be month-13 1, which is still invalid. So the correct day must be month-1 1 year++ which is Jan 1 2022.

### __isInputValid method__
If the day<0 then return False. If the day>getDaysInMonth(month, year) then return Fasle. If month<=0 or month>=13 then return False. None of that then return True.