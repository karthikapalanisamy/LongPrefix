# LongPrefix
public String longestCommonPrefix(String[] str) {
	    if(str==null || str.length==0){
	        return "";
	    }
	 
	    if(str.length==1) 
	        return str[0];
	 
	    int minLen = str.length+1;
	 
	    for(String strs: str){
	        if(minLen > strs.length()){
	            minLen = strs.length();
	        }
	    }
	 
	    for(int i=0; i<minLen; i++){
	        for(int j=0; j<str.length-1; j++){
	            String s1 = str[j];
	            String s2 = str[j+1];
	            if(s1.charAt(i)!=s2.charAt(i)){
	                return s1.substring(0, i);
	            }
	        }
	    }
	 
	    return str[0].substring(0, minLen);
