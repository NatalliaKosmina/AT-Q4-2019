1. Create file with date and time in filename.
```touch file_date-time_$(date +%d%m%y)_$(date %H%M%S).txt```
2. Create folder with date and time in filename
```mkdir folder_date-time_$(date +%d%m%y)_$(date %H%M%S)```
3. Copy files into the created folder
```cp file_date-time_041119_193957.txt README.md```
4. Rename file. Go to the folder with file.
```cd folder_date-time_041119_200053```
```mv ./file_date-time_041119_193957.txt ./renamed_file_date-time_041119_193957.txt```
5. Replace file into the other folder.
```mv ./README.md /home/nata```
6. Compare two files and write difference into other file
```grep -Fxvf file_date-time_041119_203308.txt renamed_file_date-time_041119_193957.txt > diff_file```
7. Compare two files and show difference in the Command line
```grep -Fxvf file_date-time_041119_203308.txt renamed_file_date-time_041119_193957.txt```
-F new line separated strings; -f work with file;-v - show not match strings; -x compare onli whole string
8. Count and show how many sumbols in the file.
```wc -m diff_file``` 
9. Remove all files with extension *.class
Before starting I created some files with *.class extension (touch filenmae.class). Moved to the folder with file. In other way you should write the whole path to the needed files/folder.
```rm -f ./*.class```
10. Save output list of files that consists any mask (in my case I used 'time') into the file
```find /home/nata/folder_date-time_041119_200053/ -iname '*time*' > any.txt```
11. Create file in current folder from file. You should go to the folder with file and run command
```while read LINE; do touch "$LINE"; done < folders.txt```
12. Square Circle:
 - create bash script using
```cat > circle```
- permissons. you should be in the folder with run file:
```chmod +x ./circle```
- write there your script.
- run your script:
```./first```
NB!Script should be in the src folder with java file.
13. Triangle:
 - create bash script using the same steps like for point 12(create + permission) with name 'triangle'
- run your script:
```./triangle```
NB!Script should be in the src folder with java file.
14. Quadratic:
- Go to the folder with Quadratic/src
- run script "quadratic"
```./quadratic```
15. Square Circle:
- Go to the folder with PageNumber/src
- run script "pageNumber"
```./pageNumber```
16. NumberRandom:
- Go to the folder with NumberRandom/src
- run script "number"
```./number```
17. Unit test
- Go to the folder Towns1/src
- run script "towns"
```./towns```