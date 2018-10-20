# Awesome-Toast
This is a simple android library for making custom toast. 

Add it in your root build.gradle at the end of repositories:

To get a Git project into your build:

For java: 

Step 1. Add the JitPack repository to your build file

allprojects {
		repositories {
		
			...
			
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

              dependencies {
                      implementation 'com.github.ariful06:Awesome-Toast:0.1.0'
              }


For Maven:
Step 1. Add the JitPack repository to your build file
	
        <repositories>
          <repository>
              <id>jitpack.io</id>
              <url>https://jitpack.io</url>
          </repository>
        </repositories>
  
  Step 2. Add the dependency
  
          <dependency>
              <groupId>com.github.ariful06</groupId>
              <artifactId>Awesome-Toast</artifactId>
              <version>0.1.0</version>
          </dependency>
          
          
          
          
  In your Activity or Fragment just call the the method like this.

           AwesomeToast.simpleToast(this,"This is first message",R.color.white);
