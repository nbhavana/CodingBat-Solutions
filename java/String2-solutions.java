
/* CodingBat String-2 Solutions */

/*Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

*/
public String doubleChar(String str) {
    int i = 0;
    String result = "";
    
    for(i = 0;i <= str.length()-1;i++){
	result += str.charAt(i);
	result += str.charAt(i);
    }
    return result;
}

/*Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
public int countHi(String str) {

    int i = 0;
    int counter = 0;
    if(str.length() >= 2){
	for(i= 0;i <= str.length()-1;i++){
	    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
		counter += 1;
	    }
	}
    }
    return counter;
}

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
public boolean catDog(String str) {

    int catCounter = 0;
    int dogCounter = 0;
    int i = 0;
    
    if(str.length() >= 3){
	for(i = 0;i < str.length()-2;i++){
	    if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' &&  str.charAt(i+2) == 'g'){
		dogCounter++;
	    }
	    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' &&  str.charAt(i+2) == 't'){
		catCounter++;
	    }
	}}
    
    if(catCounter == dogCounter)
	return true;
    else
	return false;   

}

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/
public int countCode(String str) {

    int i = 0;
    int counter = 0;
    if(str.length() > 3){
	for(i = 0;i < str.length()-3;i++){
	    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' &&  str.charAt(i+3) == 'e'){
		counter++;
	    }
	}
    }
    return counter;
}

/*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/
public boolean endOther(String a, String b) {

    a = a.toLowerCase();
    b = b.toLowerCase();
    
    if(a.endsWith(b) || b.endsWith(a))
	return true;
    else
	return false;
}

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/
public boolean xyzThere(String str) {
 
    int i = 0;
    for(i=0;i<str.length()-2;i++){
	if("xyz".equals(str.substring(i,i+3))){
	    if(i == 0 || str.charAt(i-1) != '.'){
		return true;
	    }
	}
    }
    return false;
}

/*    

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/

public boolean bobThere(String str) {
    int i = 0;
    for(i=0;i<str.length()-2;i++){
	if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
	    return true;
	}
    }
    return false;
	
}

/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
*/
public boolean xyBalance(String str) {

    for(int i =  str.length() - 1; i >= 0; i--){
	if( str.charAt(i) == 'x')
	    return false;
	else if( str.charAt(i) == 'y')
	    return true;
    }
    return true;
}


public boolean xyBalance(String str) {

    int i = 0;
    int j = 0;
    boolean result = false; 
    if(str.indexOf('x') == -1)
	return true;
    if(str.charAt(str.length()-1) == 'x')
	return false;
    for(i=0;i<str.length();i++){
	if(str.charAt(i) == 'x'){
	    for(j=i;j<str.length();j++){
		if(str.charAt(j) == 'y')
		    result = true; 
	    }
	}
    }
    
    return result;
    
}

/*Given two strings, A and B, create a bigger string made of the first char of A, the first char of B, the second char of A, the second char of B, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/
public String mixString(String a, String b) {

    String tempstr = "";
    int i = 0;
    
    for(i=0;i<a.length() && i<b.length();i++){
	tempstr += a.charAt(i);
	tempstr += b.charAt(i);
    }
    if(a.length()<b.length()){
	tempstr += b.substring(i);
    }
    if(a.length()>b.length()){
	tempstr += a.substring(i);
    }
    return tempstr;
    
}
/*
Given a string and an int N, return a string made of N repetitions of the last N characters of the string. You may assume that N is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
*/
public String repeatEnd(String str, int n) {

    String tempstr = "";
    String newstr = "";
    tempstr = str.substring(str.length()-n);
    
    for(int i = 0;i<n;i++){
	newstr = newstr + tempstr;
    }
    return newstr;
}

/*Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
*/
public String repeatFront(String str, int n) {
   
    int i = 0;
    String tempstr = "";
    tempstr = str.substring(0,n);
    String newstr = "";
    
    for(i=0;i<n;i++){
	newstr = newstr + tempstr.substring(0,n-i);
    }
    return newstr;

}

/*Given two strings, word and a separator, return a big string made of count occurences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/

public String repeatSeparator(String word, String sep, int count) {

    String tempstr = "";
    int i = 0;
    while (i < count)
	{
	    if( i < count - 1)
		tempstr += word + sep;
	    else
		tempstr += word;
	    i++;
	}
    return result;
} 

/*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
*/
public boolean prefixAgain(String str, int n) {
 
    String tempstr = "";
    tempstr = str.substring(0,n);
    
    if(str.indexOf(tempstr,n) != -1)
	return true;
    else 
	return false;
    
}

/*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/
public boolean xyzMiddle(String str) {
   
    int index = (str.length()-3)/2;
    
    if(str.length()<3)
    return false;
    if(str.length() % 2 != 0){
	if(str.charAt(index) == 'x' && str.charAt(index+1) == 'y' && str.charAt(index+2) == 'z'){
	    return true;
	}
	else{
	    return false;
	}
    }
    
    else{
	if(str.charAt(index) == 'x' && str.charAt(index+1) == 'y' && str.charAt(index+2) == 'z'){
	    return true;
	}
	else if(str.charAt(index+1) == 'x' && str.charAt(index+2) == 'y' && str.charAt(index+3) == 'z'){
	    return true;
	}
	else{
	    return false;
	}
    }
    
}

/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/
public String getSandwich(String str) {
 
    int firstIndex = str.indexOf("bread");
    int lastIndex = str.lastIndexOf("bread");

    if(firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex){
	return str.substring(firstIndex+5,lastIndex);
    }
    else{
	return "";
    }

}

/*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/
public boolean sameStarChar(String str) {
    int i = 0;
    for(i=1;i < str.length()-1;i++){
	if(str.charAt(i) == '*'){
	    if(str.charAt(i-1)!=str.charAt(i+1)){
		return false;
	    }
	   
	}
    }
    return true;
	   
}
/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/
public String zipZap(String str) {

    int i = 0;
    StringBuilder sb = new StringBuilder();
    if(str.length()<=2)
	return str;
    for(i = 0;i<=str.length()-1;){
	if(str.charAt(i)=='z' && str.charAt(i+2)=='p'){
	    sb.append("zp");
            i+=3;
	}
	else{
	    sb.append(str.charAt(i));
            i++;
	}
    }
    return sb.toString();
}

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/

public String starOut(String str) {
    String resString = ""; 
    int i = 0;
    for(i = 0; i < str.length(); i++){
	if(str.charAt(i)=='*'){
	}
	else if(i != 0 && str.charAt(i-1)=='*'){
	} 
	else if(i != str.length() - 1 && str.charAt(i+1)=='*'){
	} 
	else{ 
	    resString += str.charAt(i); 
	} 
    } 
    return resString;   
}

/*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public String plusOut(String str, String word) {
   String tempstr = "";
    int i = 0;
    
    for(i = 0;i < str.length();i++){
	if(i + word.length() > str.length()) {
	    break;
	}
	if( i < str.length()){
	    if(word.equals(str.substring(i,i+word.length()))){
		tempstr += word;
		i += word.length()-1;
	    }
	    else{
		tempstr += "+";
	    }
	}
    }
    if(tempstr.length() != str.length()) {
	while(tempstr.length() != str.length()) {
	    tempstr += "+";
	}
    }
    return tempstr;
}

/*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
*/
public String wordEnds(String str, String word) {
  String tempstr = "";
    int i = 0;
    
    for(i = 0; i < str.length();i++){
    if(word.length() == str.length()) {
return "";
}
    if(i + word.length() > str.length()) {
	    break;
	}
	if( i < str.length()){
	
	    if(word.equals(str.substring(i,i+word.length()))){
		if(i==0){
		    tempstr += str.charAt(i+word.length());
		}
		else {
		    tempstr += str.charAt(i-1);
		    tempstr +=str.charAt(i+word.length());
			
		}
	}

    }
}
    return tempstr;
   
}