import java.util.*;

class IsContainPerformance{
static int recursive1(String sentence, String word) {
int pos = sentence.indexOf(word);
if (pos == -1) {
return 0;
}
return 1 + recursive1(sentence.substring(pos + word.length() - 1), word);
}

static int recursive2(String sentence, String word) {
if(!sentence.contains(word)) {
return 0;
}
sentence = sentence.replaceFirst(word, "");
return 1 + recursive2(sentence, word);
}

static int recursive3(String s1, String s2) {
if (s1.length() < s2.length())
return 0;
if (s1.substring(0, s2.length()).equals(s2))
return 1 + recursive2(s1.substring(s2.length()), s2);
return recursive2(s1.substring(1), s2);
}

static int iterative1(String sentence,String word) {
int count =0;
int index= 0;
while(sentence.contains(word)){
index = sentence.indexOf(word,index);      
if(index!=-1){
count++;
index +=word.length()-1;
}else{
break;
}
}
return count;
}
static int iterative2(String sentence,String word) {
int count =0;
int index= 0;
while(sentence.contains(word)){
index = sentence.indexOf(word,index);
if(index!=-1){
count++;
sentence= sentence.replaceFirst(word,"");
}else{
break;
}    
}
return count;
}

static int iterative3(String s1, String s2) {
int count = 0;
for (int i = 0; i <= s1.length() - s2.length(); i++) {
if (s1.substring(i, i + s2.length()).equals(s2)) {
count++;
}
}
return count;
}

public static void main (String arg[]) {

int noOfTimes=1000;
long s1_tt=0, s2_tt=0,s3_tt=0, s4_tt=0,s5_tt=0, s6_tt=0,st,et;
float s1_avg,s2_avg,s3_avg,s4_avg,s5_avg,s6_avg;

for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
recursive1("abcabca","abc");
et=System.nanoTime();
s1_tt+=et-st;
}
s1_avg=(float)s1_tt/noOfTimes;

for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
recursive2("abcabca","abc");
et=System.nanoTime();
s2_tt+=et-st;
}
s2_avg=(float)s2_tt/noOfTimes;


for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
recursive3("abcabca","abc");
et=System.nanoTime();
s3_tt+=et-st;
}
s3_avg=(float)s3_tt/noOfTimes;

for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
iterative1("abcabca","abc");
et=System.nanoTime();
s4_tt+=et-st;
}
s4_avg=(float)s4_tt/noOfTimes;


for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
iterative2("abcabca","abc");
et=System.nanoTime();
s5_tt+=et-st;
}
s5_avg=(float)s5_tt/noOfTimes;

for (int i=0;i<noOfTimes;i++){
st=System.nanoTime();
iterative3("abcabca","abc");
et=System.nanoTime();
s6_tt+=et-st;
}
s6_avg=(float)s6_tt/noOfTimes;

System.out.println(s1_avg);
System.out.println(s2_avg);
System.out.println(s3_avg);
System.out.println(s4_avg);
System.out.println(s5_avg);
System.out.println(s6_avg);

}
}