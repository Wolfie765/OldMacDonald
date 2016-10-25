 //implements Animal //your code here
 
     
class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private String mySounds;      
     public Chick(String type, String sound, String sounds)     {         
     
         myType = type;         
         if( Math.random()*1 < 0.5)
         	mySound = sound;
         else
         	mySound = sounds;     
     }     
     public Chick()     {         
         mySounds = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

}
