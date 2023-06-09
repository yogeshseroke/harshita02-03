package harshita02_03.oops;

public class OopsOverview {

	/*
	 *    OOPS :- (object oriented programming structure)
	 * 		   :- it used to create small scale to large scale application.
	 * 		   :- reusability, security, extendability			
	 * 
	 * 			       [oops]
	 *            /            \
	 *         basic        major pillars 
	 *           ||              ||
	 *           
	 *        class             Encapsulation
	 *        object            Inheritance
	 *        dataMembers       Abstraction
	 *        memberFunctions   Polymorphism 
	 *        constructor
	 *        init block
	 *        static block
	 *        main()
	 *        inner classes
	 *        properties
	 *        
	 *        
	 *           
	 *    class :- class blue print of object.
	 * 
	 *      eg(1) :-  Animal :- class
	 *                 ||
	 *                 cat       (1)objects
	 *                 dog       (2)objects
	 *                 tiger     (3)objects
	 *                 .
	 *                 .
	 *                 . 
	 *      eg(2) :- Electronic :- class
	 *               (TV,Fan,mob):-objects
	 *                
	 *    =========================================================            
	 * 
	 * 		object :- real world entity. state, behavior.
	 * 
	 * 			eg:- className objectName = new ClassName();
	 *    =========================================================
	 * 		
	 *      DataMember / Variables :- special identifier whose value can be change at compile time or run.
	 *      
	 *       eg:- int a = 10; // a = variable
	 *       
	 *       type :- (1)static datamember(className call) :- local and global 
	 *               (2)non-static datamember(object call) :- local and global
	 *       
	 *       //static eg :- static int a;(global)
	 *       
	 *           static void add(){
	 *           
	 *           		int a;  // local static
	 *           }
	 *       
	 *       //non-static eg :- int a;(global)
	 *       
	 *        void add(){
	 *        
	 *        	int a;  // local non-static
	 *        }
	 *       
	 *      MemberFunction / methods :- particular task perform 
	 *      
	 *       eg:- void display(){
	 *       
	 *       			System.out.println("Hello World");
	 *       		}
	 *       
	 *       types :- 
	 *       
	 *       (1)static memberfunction :- non-parameterized,parameterized,
	 *                                :- without return type, with return type
	 *          
	 *          //non-parameterized, without return type                       
	 *          static void add(){
	 *          
	 *          }
	 *          
	 *          //non-parameterized, with return type
	 *          static int add(){
	 *             return 0;
	 *          }
	 *          
	 *          //without return type, with parameter
	 *          static void add(int a, int b){
	 *          
	 *          }
	 *          
	 *          //with return type, with parameter
	 *          static int add(int a, int b){
	 *             return 0;
	 *          }
	 *          
	 *                                           
	 *                                 
	 *       (2)non-static memberfunction :- non-parameterized,parameterized,
	 *                                    :- without return type, with return type
	 *       
	 *          //non-parameterized, without return type                       
	 *          void add(){
	 *          
	 *          }
	 *          
	 *          //non-parameterized, with return type
	 *          int add(){
	 *             return 0;
	 *          }
	 *          
	 *          //without return type, with parameter
	 *          void add(int a, int b){
	 *          
	 *          }
	 *          
	 *          //with return type, with parameter
	 *          int add(int a, int b){
	 *             return 0;
	 *          }
	 *       
	 *       
	 *       ===================================================
	 *       
	 *       constructor :- it is used to create an object...
	 *                   :-  constructorName = className
	 *                
	 *                class A{
	 *                
	 *                
	 *                
	 *                }
	 *                
	 *                save => file.java
	 *                
	 *                compile :- javac fileName.java
	 *                
	 *                class A{
	 *                
	 *                	A(){
	 *                
	 *                	}
	 *                
	 *                }
	 *                
	 *                run :- java className
	 *                =======================
	 *                
	 *                type of constructor : (1)default (2)parameterized (3)copy
	 *                
	 *                (1) A(){
	 *                
	 *                
	 *                	   }
	 *                
	 *                (2) A(int a, int b){
	 *                
	 *                
	 *                	  }
	 *                
	 *                (3) A(object){
	 *                
	 *                
	 *                    }
	 *                    
	 *              =====================================================================
	 *              
	 *                    
	 *              //init block or initialize block :- it is used to initialize non static variables.
	 *              
	 *                   eg:-   int a;
	 *                   
	 *                     		int b;	
	 *                     
	 *                         {
	 *                            a=10;
	 *                            b=20;
	 *                         }
	 *                         
	 *            =======================================================================
	 *            
	 *              //static block :- it is used to initialized static variables.
	 *              
	 *              eg:- static x;
	 *                   static y;
	 *                   
	 *                   static
	 *                   {
	 *                      x=1;
	 *                      y=2;
	 *                   }
	 *                   
	 *           =============================================================================        
	 *           
	 *           
	 *           inner class :-  class inside class
	 *           
	 *           //outer class
	 *           class A{
	 *           
	 *               //inner class 
	 *               class B{
	 *               
	 *                   class B_b{
	 *                   
	 *                   }
	 *               
	 *               }
	 *               
	 *               //inner class
	 *               class C{
	 *               
	 *               
	 *               }
	 *           }
	 *           
	 *           
	 *           //////////////////////
	 *           
	 *           
	 *           Encapsulation :- Data binding
	 *           
	 *           
	 *           //before encapsulation
	 *           class A{
	 *           
	 *             String pin = "1234";
	 *             String password = "hr@453#cv";
	 *           
	 *           }
	 *           
	 *           //after encapsulation
	 *           class A{
	 *              private String pin;
	 *              private String password;
	 *              
	 *              void accept(){
	 *                 pin = "1234";
	 *                 password = "hr@453#cv";
	 *              }
	 *           }
	 *           
	 *         //////////////////////////////////////////
	 *         
	 *                     
	 *         Inheritance :- parent class ki properties
	 *                                 || 
	 *                                 ||(using extends keyword)
	 *                                 ||
	 *                             child class          
	 *         //parent                    
	 *         class A{
	 *           void add(){
	 *             System.out.println("parent class ki method");
	 *           }
	 *         } 
	 *         
	 *         //child
	 *         class B extends A{
	 *           void sub(){
	 *             System.out.println("child class ki method");
	 *           }
	 *         }
	 *            
	 *                             
	 *         Types of inheritance :- 
	 *         
	 *         (1) single level inheritance
	 *                                       P
	 *                                       |
	 *                                       C
	 *         
	 *         
	 *         (2) multilevel inheritance
	 *         
	 *                                      P
	 *                                      |
	 *                                      C
	 *                                      |
	 *                                      SC
	 *         (3) Hierarchical inheritance 
	 *         
	 *                                        P
	 *                                      /   \
	 *                                     C1    C2
	 *                                     |    /   \
	 *                                    sc1  sc1 sc2
	 *                                    
	 *                                    
	 *        (4) Multiple inheritance.... (interface keyword)
	 *        
	 *        interface A{
	 *            //abstract method
	 *            void add();
	 *        }
	 *        
	 *        interface B{
	 *            //abstract method
	 *            void add();
	 *        }
	 *        
	 *        class C implements A,B{
	 *             void add{
	 *                a-b;
	 *             }
	 *        }  
	 *        
	 *        ============================================
	 *        
	 *        Abstraction :- Data Hiding
	 *        
	 *        (1)access specifier :- 
	 *              public :- all / visibility global 
	 *              private :- class level
	 *              protected :- same package, different package ki sub class
	 *              default :- same package 
	 *              
	 *        (2)abstract class :- abstract methods / static / default
	 *        
	 *         abstract class A{
	 *            
	 *            //default method
	 *            void m1(){
	 *              
	 *            }
	 *            
	 *            //static method
	 *            static m2(){
	 *            
	 *            }
	 *            
	 *            //abstract method
	 *            abstract void m3();
	 *            
	 *         
	 *         }
	 *         
	 *        (3)interface :- pure abstract class
	 *        //before jdk 1.8
	 *        interface A{
	 *           
	 *           //abstract method
	 *           void m1();
	 *           
	 *        }
	 *        
	 *        //after jdk 1.8 
	 *         
	 *         interface A{
	 *             //abstract method
	 *             void m1();
	 *             
	 *             //default method
	 *             default void m2(){
	 *             
	 *             }
	 *             
	 *             //static method
	 *             static void m3(){
	 *             
	 *             }
	 *         
	 *         }
	 *         
	 *        =============================================
	 *        
	 *        PolyMorphism :- reusability
	 *        
	 *        poly -> many
	 *        morphism -> form
	 *        
	 *        type :- (1)compile time polyMorphism / static / overloading
	 *                (2)run time polyMorphism / non-static / overriding 
	 *                
	 *        overloading :- method name should be same, but parameter should be difference
	 *        
	 *        class A {
	 *                
	 *                void logic(int a, int b){
	 *                     a+b;
	 *                }
	 *                
	 *                void logic(int a, float b){
	 *                     a-b;
	 *                }
	 *                
	 *                void logic(float a, float b){
	 *                     a*b;
	 *                }
	 *                
	 *                void logic(String name){
	 *                    System.out.println(name);
	 *                }                           
	 *                                         
	 *        }       
	 *        
	 *                            
	 *        overriding :- method name same but functionality should be different.
	 *        
	 *        class A{
	 *         void logic(){
	 *             a+b;    
	 *         }
	 *       }
	 *       
	 *       class B extends A{
	 *         
	 *         //override
	 *         void logic(){
	 *             a-b;    
	 *         }
	 *         
	 *       }                     
	 * */
	
	
}
