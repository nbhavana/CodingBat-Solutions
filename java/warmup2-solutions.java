/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */
public String stringTimes(String str, int n) {
    String newstr ="";
    while(n>0){
	newstr += str;
	n--;
    }
    return newstr;
}

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front; 
*/
public String frontTimes(String str, int n) {
    int strlen = str.length();
    String tempstr = ""; 
    String newstr = "";
    if(strlen<3){
	tempstr = str;
    }
    else{
	tempstr = str.substring(0,3);
    }
    while(n>0){
	newstr += tempstr;
	n--;
    }
    return newstr;
	
}

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
*/

int countXX(String str) {

    int i = 0;
    int counter = 0;
    for(i=0;i<str.length()-1;i++){
	if((str.charAt(i)=='x')& (str.charAt(i+1)=='x')){
		counter+=1;		  
	    }
    }
    return counter;
}


/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
*/


boolean doubleX(String str){
    int index = 0;
    index = str.indexOf('x');
    
    if((index+1)>=str.length()){
        return false;
    }
    else if(str.charAt(index+1) == 'x'){
	return true;
    }
    else
	return false;
}

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". 
*/


public String stringBits(String str) {
    int i = 0;
    String tempstr = "";
    for(i=0;i<=str.length()-1;i+=2){
	tempstr = tempstr + str.charAt(i);
    }
  return tempstr;
}

/*Given a non-empty string like "Code" return a string like "CCoCodCode". 
 */

public String stringSplosion(String str) {
    int i = 0;
    String tempstr = "";
    for(i=0;i<=str.length()-1;i++){
	tempstr+=str.substring(0,i+1);
    }
    return tempstr;
    
}

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/

public int last2(String str) {
    int strlen = str.length()-2;
    int i = 0;
    int counter = 0;
    if(strlen >= 0){
	String endstr = str.substring(strlen);
	for(i=0;i<strlen;i++){
	    if(str.substring(i,i+2).equals(endstr)){
		counter++;
	    }
	}
    }
    return counter;
}

/*
Given an array of ints, return the number of 9's in the array.

arrayCount9({1, 2, 9}) → 1
arrayCount9({1, 9, 9}) → 2
arrayCount9({1, 9, 9, 3, 9}) → 3
*/
public int arrayCount9(int[] nums){
    int size_of_array = nums.length;
    int i = 0 ;
    int counter = 0;
    for(i=0;i<=size_of_array-1;i++){
	if(nums[i]== 9){
	    counter++;
	}
    }
    return counter;
}

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

arrayFront9({1, 2, 9, 3, 4}) → true
arrayFront9({1, 2, 3, 4, 9}) → false
arrayFront9({1, 2, 3, 4, 5}) → false
*/
public boolean arrayFront9(int[] nums){
    int size_of_array = nums.length;
    int i = 0 ;
    if(size_of_array>4)
	size_of_array = 4;
    for(i=0;i<=size_of_array-1;i++){
	if(nums[i]== 9){
	    return true;
	}
    }
    
    return false;
    
}
 
/*
Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.

array123({1, 1, 2, 3, 1}) → true
array123({1, 1, 2, 4, 1}) → false
array123({1, 1, 2, 1, 2, 3}) → true
 */   

public boolean array123(int[] nums){
    
    int size_of_array = nums.length;
    boolean one = false;
    boolean two = false;
    boolean three = false;
    int i = 0 ;
    for(i=0;i<=size_of_array-1;i++){
	if(nums[i]== 1){
	    one = true;
	}
	if(nums[i]== 2){
	    two = true;
	}
	if(nums[i]== 3){
	    three = true;
	}
    }
    if(one & two & three)
	return true;
    else
	return false;
}
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/

public int stringMatch(String a,String b){
    int strlenA = a.length();
    int strlenB = b.length();
    int len = 0;
    int i = 0;
    int counter = 0;
    if(strlenA>=strlenB)
	len = strlenB;
    else
	len = strlenA;
    for(i=0;i<=len-1;i++){
	if(a.substring(i,i+2).equals(b.substring(i,i+2))){
	    counter++;
	}
    }

}

/*Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
public String stringX(String str){

    if(str.length()<2){
	return str;
    }
    
    String tempstr = "";
    tempstr += str.charAt(0);
    int i = 0;
    for(i=1;i<str.length()-1;i++){
	if(str.charAt(i)!='x'){
	    tempstr +=str.charAt(i);
	}
    }
    tempstr += str.charAt(str.length()-1);
    return tempstr;
    
}

/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public String altPairs(String str) {
    
    if(str.length()<2)
	return str;
    String tempstr = "";
    int i = 0;
    for(i=0;i<str.length();i+=4){
	tempstr = tempstr+str.charAt(i);
	if((i+1)<str.length())
	    {
		tempstr+=str.charAt(i+1);
	    }       
    }
    return tempstr;
}

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public String stringYak(String str) {

    return str.replaceAll("y.k","");  
    
}
/*Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667({6, 6, 2}) → 1
array667({6, 6, 2, 6}) → 1
array667({6, 7, 2, 6}) → 1

*/
public int array667(int[] nums) {
    int size_of_array = nums.length;
    int i = 0 ;
    int counter = 0;
    for(i=0;i<=size_of_array;i++){
	if((i+1)<size_of_array){
	    if((nums[i] == 6 & nums[i+1]== 6)|(nums[i] == 6 & nums[i+1]== 7)){
		counter++;
	    }
	}
    
    }
}
/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

noTriples({1, 1, 2, 2, 1}) → true
noTriples({1, 1, 2, 2, 2, 1}) → false
noTriples({1, 1, 1, 2, 2, 2, 1}) → false
*/

public boolean noTriples(int[] nums) {
    int size_of_array = nums.length;
    int i = 0 ;
    boolean triples = true;
    for(i=0;i<=size_of_array;i++){
	if((i+2)<size_of_array){
	    if((nums[i] == nums[i+1]) & (nums[i+1] == nums[i+2])){
		triples =  false;
	    }
	}
	
    }
    return triples;
}

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271({1, 2, 7, 1}) → true
has271({1, 2, 8, 1}) → false
has271({2, 7, 1}) → true
*/
public boolean has271(int[] nums) {
    
    int i = 0;
    int temp = 0;
    for (i = 0; i <= nums.length ; i++) {
	
	if((i+2)<nums.length){
	    temp = nums[i] - nums[i+2];
	    if ((nums[i+1] == nums[i] + 5) & (temp >= -1 && temp <= 3)){

                      return true;
                  }		
	    }
	}
    return false;
}


	
