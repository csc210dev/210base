String s1 = "abc";
String s2 = "xyz";
String s3 = s1;

s1 = s2;

s2 = s2 + "!";

s1 = s2 = s3 = s1 + s2 + s3;
