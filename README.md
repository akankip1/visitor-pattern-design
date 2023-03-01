# cs542-fall-22-assign4

Team Members:

## Name: Ashrit Kankipati
## Email: akankip1@binghamton.edu



## Number of slack days used: 3 
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myVisitor/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myVisitor/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile myVisitor/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myVisitor/src/build.xml run -Darg0=<sentencesfilename.txt> -Darg1=<wordsfile.txt> -Darg2=<k> -Darg3=<topkmostfile.txt> -Darg4=<replacedfile.txt> -Darg5=<Debugval>

## you can run it in the following manner:

ant -buildfile myVisitor/src/build.xml run -Darg0=sentences.txt -Darg1=words.txt -Darg2=3 -Darg3=topmost.txt -Darg4=spell.txt -Darg5=1

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
Our program accepts two input files and one k value to give the desired outputs to the files. 
Patterns used:
1) Visitor pattern: For this two visitors have been created.
1st visitor: visits myArrayList and runs the analytics for k most frequent words in the file. We have ignored the MyElement condition in our submission.
2nd visitor: visits the class where string replacement(UK to US conversion) is done where 2 strategies have been implemented internally.
2) Strategy pattern: 
Strategy 1: compares the words and the comparison is case sensitive, i.e if the words input contains the words with different case compared to the words in sentences, it doesn't get replaced.
Strategy 2: compares the words and the comparison is not case sensitive, i.e even though the words input contains the words with different case compared to the words in sentences, it gets replaced.

class names for the two strategies are: strategy1() and strategy2() which are passed while creating the elements: visitor vis1 = new spellV(new strategy1(),new strategy2());
Assumed that all input files are well formatted.
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"We have done this assignment completely on my own. We have not copied
it, nor have We given my solution to anyone else. We understand that if
we am involved in plagiarism or cheating we will have to sign an
official form that we have cheated and that this form will be stored in
my official university record. We also understand that we will receive a
grade of 0 for the involved assignment for my first offense and that we
will receive a grade of F for the course for any additional
offense.""

Date: 12/11/2022



