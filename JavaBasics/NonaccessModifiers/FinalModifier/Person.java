/*
 *  Final Variable
 *
 *  It can be assigned a value only once.
 *
 */

class Person
{
  final long MAX_AGE;
  final StringBuilder name = new StringBuilder("Francisco");
  
  Person()
  {
    MAX_AGE = 99;
    
    name.append(" Maria");
    
  }
}
