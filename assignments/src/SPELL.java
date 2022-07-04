package com.SPEL;

import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class SPEL {  
public static void main(String[] args) {  
ExpressionParser parser = new SpelExpressionParser();  
  
Expression exp = parser.parseExpression("'Hello SPEL'");  
String message = (String) exp.getValue();  
System.out.println(message);  
//OR  
System.out.println(parser.parseExpression("'Hello SPEL'").getValue()); 
ExpressionParser parser1 = new SpelExpressionParser();  
Expression exp1 = parser1.parseExpression("'Welcome SPEL'.concat('!')");  
String message1 = (String) exp.getValue();  
System.out.println(message1);  

Expression exp2 = parser.parseExpression("'Hello World'.bytes");  
byte[] bytes = (byte[]) exp2.getValue();  
for(int i=0;i<bytes.length;i++){  
    System.out.print((char)bytes[i]+" ");  
    
    Expression exp3 = parser.parseExpression("'Hello World'.bytes.length");  
    int length = (Integer) exp3.getValue();  
    System.out.println(length);  
    
    Expression exp4 = parser.parseExpression("new String('hello world').toUpperCase()");  
    String message3 = exp.getValue(String.class);  
    System.out.println(message3);  
    //OR  
    System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
}  
}  
}  
