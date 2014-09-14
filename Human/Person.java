package human;

class Person
{
  
  /*
   *  Final Variable
   *
   *  It can be assigned a value only once.
   *
   */
  
  final long MAX_AGE;
  final StringBuilder name = new StringBuilder("Francisco");
  
  Person()
  {
    MAX_AGE = 99;
    
    String name;
    String getName()
    {
      return name;
    }
    
    name.append(" Maria");
    
  }
}

