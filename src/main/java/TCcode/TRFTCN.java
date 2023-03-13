package TCcode;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TRFTCN {
	int a[]= {5,6,7,120,121,122};

		@Test
			public void Alphabets (WebDriver driver) throws InterruptedException {
			  int b[]= {1,3,5,7,9,11};
			 
			 for (int n=0;n<90;n++) {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//div[@class=\"icon-add icon-small-inline\"]")).click();
			 }
			 Thread.sleep(3000);
			 
				for (int i=0;i<a.length;i++) {
					
					int length=a[i];
					//int j=b[i];
			    //int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
			    
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    int id=b[i];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(length, "Alphabets", generatedString);
			    
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(generatedString);
			    
			    int id1=b[i]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			   ExpectedResult(length, path1, driver);
			 
			    }
				}
		
	@Test
	public void Numbers(WebDriver driver) {
	 
	 int b[]= {13,15,17,19,21,23};
	 
	 
		for (int i=0;i<a.length;i++) {
			int length=a[i];
	    //int length = 10;
	    boolean useLetters = false;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    
	    int id=b[i];
	    String path = "//div[@element-index='"+id+"']"; driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String inp = input(length, "Numbers Combination", generatedString);
	    driver.findElement(By.xpath(path)).sendKeys(inp);
	    System.out.println(generatedString);
	    
	    int id1=b[i]+1;
	    String path1 = "//div[@element-index='"+id1+"']";
	    ExpectedResult(length, path1, driver);
		}
			
	    }
	   

				@Test
				public void SpecialChars(WebDriver driver) {
		
					int b[]= {25,27,29,31,33,35};
		
					for (int i=0;i<a.length;i++) {

					final String alphabet = "<>/!@#$^&-,.";
					final int N = alphabet.length();
					Random rd = new Random();
					int iLength = a[i];
					StringBuilder sb = new StringBuilder(iLength);
					
					for (int k = 0; k < iLength; k++) {
						sb.append(alphabet.charAt(rd.nextInt(N)));
						}
					String S= sb.toString();
					String str = S.substring(0, iLength);
			
					int id=b[i];
					String path = "//div[@element-index='"+id+"']";
					String inp = input(iLength, "Specialchars Combination", str);
					driver.findElement(By.xpath(path)).sendKeys(inp);
					System.out.println(str);
		    
					int id1=b[i]+1;
					String path1 = "//div[@element-index='"+id1+"']";
					ExpectedResult(iLength, path1, driver);
		  		    }
					}

		@Test
		public void Blank(WebDriver driver) {
			
				int b[]= {37,39,41,43,45,47};
				for (int i=0;i<a.length;i++) {

				final String alphabet =" _";
				final int N = alphabet.length();
				Random rd = new Random();

				int iLength = a[i];
				StringBuilder sb = new StringBuilder(iLength);
				for (int k = 0; k < iLength; k++) {
					sb.append(alphabet.charAt(rd.nextInt(N)));
				}
				String S = sb.toString();
				String str = S.substring(0, iLength);
				
			    int id=b[i];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(iLength, "Blank (_)", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[i]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			   ExpectedResult(iLength, path1, driver);
			    
			    }
				}

		@Test
		public void Alpha_Numeric(WebDriver driver) {
				
		int b[]= {49,51,53,55,57,59};
		for (int i=0;i<a.length;i++) {
		int length=a[i];
					
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				    
		int id=b[i];
		String path = "//div[@element-index='"+id+"']";
		String inp = input(length, "Alpha_Numeric Combination", generatedString);
		driver.findElement(By.xpath(path)).sendKeys(inp);
		System.out.println(generatedString);
				    
		int id1=b[i]+1;
		String path1 = "//div[@element-index='"+id1+"']";
		ExpectedResult(length, path1, driver);
		}
	}
			
			
			@Test
			public void AlphabetwithSpecial(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				
				 int b[]= {61,63,65,67,69,71};
				 
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			      	 sb.append(specials .charAt(rnd.nextInt(specials .length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			 
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Alphabet & Specialchars Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			    ExpectedResult(le, path1, driver);
			    		    
			  }
				}
			
			@Test
			public void AlphabetwithBlank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String alphabet ="_";
				
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         sb.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
			     
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {73,75,77,79,81,83};
			  
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Alphabet & Blank Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			   ExpectedResult(le, path1, driver);
			    }
			    }
					
			
			@Test
			public void Numberwith_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String blank ="_";
				
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(blank.charAt(rnd.nextInt(blank.length())));
			         sb.append(numbers .charAt(rnd.nextInt(numbers .length())));
			         
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {85,87,89,91,93,95};
		
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Number & Blank(_) Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			   ExpectedResult(le, path1, driver);
			   
			    }
			   }
			
			
			@Test
			public void Number_special(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@_!#%&()*+,-.~";
				String blank ="_";
				
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
			         
			         sb.append(specials .charAt(rnd.nextInt(specials .length())));
			        
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {97,99,101,103,105,107};
			   
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Number & Specialchars Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			  ExpectedResult(le, path1, driver);
			    
			    }
			    }
			
			@Test
			public void Special_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String blank ="_";
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(blank.charAt(rnd.nextInt(blank.length())));
			          sb.append(specials .charAt(rnd.nextInt(specials .length())));
			    }
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {109,111,113,115,117,119};
			    
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Specialchars & Blank Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			    ExpectedResult(le, path1, driver);
			   
			    }
			}
			
			@Test
			public void AlphabetwithNumber_special(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         
			         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
			         sb.append(specials .charAt(rnd.nextInt(specials .length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {121,123,125,127,129,131};
			    
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Alpha_Numeric & Specialchars Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			   ExpectedResult(le, path1, driver);
			    
				}
			}
			
			@Test
			public void AlphabetwithNumber_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String alphabet ="_";
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         
			         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
			         sb.append(alphabet .charAt(rnd.nextInt(alphabet .length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    
			    int b[]= {133,135,137,139,141,143};
			    
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Alpha_Numeric & Blank Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			    ExpectedResult(le, path1, driver);
				}
			}
			
			@Test
			public void AlphabetwithSpecial_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String blank ="_";
							
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         
			         sb.append(blank.charAt(rnd.nextInt(blank.length())));
			         sb.append(specials .charAt(rnd.nextInt(specials .length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {145,147,149,151,153,155};
			 
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Alphabet,Specialchar & Blank(_) Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			    ExpectedResult(le, path1, driver);
			    
				}
			}
			
			
			@Test
			public void NumberwithSpecial_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@!#%&()*+,-.~";
				String blank ="_";
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = a[k];
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
			         
			         sb.append(blank.charAt(rnd.nextInt(blank.length())));
			         sb.append(specials .charAt(rnd.nextInt(specials .length())));
			         
	    		}
			    String S = (sb.toString());
			    String str = S.substring(0, len);
			    int b[]= {157,159,161,163,165,167};
			  
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    String inp = input(le, "Number,Specialchar & Blank(_) Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			    
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			  ExpectedResult(le, path1, driver);
			    
				}
			}

			
		
			@Test
			public void Alpha_NumericwithSpecial_Blank(WebDriver driver) {
				String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String numbers = "0123456789";
				String specials = ":<=>?@_!#%&()*+,-.~";
				String blank=" ";
				
				for (int k=0;k<a.length;k++) {
			    StringBuilder sb = new StringBuilder();
			    Random rnd =new Random();
			    int le = (a[k]);
				int len = le;

			    // Generate password with letters first. This part is the same as the original code.
			    for (int i = 0; i <= len; i++) {
			         sb.append(AB.charAt(rnd.nextInt(AB.length())));
	 				 sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
			         sb.append(specials .charAt(rnd.nextInt(specials .length())));
			         sb.append(blank.charAt(rnd.nextInt(blank.length())));

			    }
	 			String S = (sb.toString());
	 			String str = S.substring(0, len);
	 			int b[]= {169,171,173,175,177,179};
			    
			    int id=b[k];
			    String path = "//div[@element-index='"+id+"']";
			    
			    String inp = input(le, "Alpha_Numeric,Specialchars & Blank Combination", str);
			    driver.findElement(By.xpath(path)).sendKeys(inp);
			    System.out.println(str);
			
			    int id1=b[k]+1;
			    String path1 = "//div[@element-index='"+id1+"']";
			    ExpectedResult(le, path1, driver);
			   }
			}
			
			@Test
			public String input(int num,String type,String str) {
				String string = "Enter a "+num+" "+type+"\n" +"Input :"+"\n"+""+str;
				return string;
			}
			
			@Test
			public void ExpectedResult(int s,String path1,WebDriver driver) {
				if(s<=5 || s>=122)
				{
			    	driver.findElement(By.xpath(path1)).sendKeys("Lead name text field should not accept.");
			    }
				
				else {driver.findElement(By.xpath(path1)).sendKeys("Lead name text field should accept.");
					
			    }
			}
			
		}

