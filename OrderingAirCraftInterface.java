public class AirCraft implements Order
{
   private String make;
   private int numSeats;

   public AirCraft(String make, int numSeats)
   {
      this.make = make;
      this.numSeats = numSeats;
   }
   
   public boolean greaterThan(Order other);
     Aircraft otherCraft = (Aircraft)other;
     if((this.numSeats > otherCraft.numSeats)) {
       return true;
     }
     return false;
   }
   public String getMake()
   {
      return make;
   }

   public int getNumSeats()
   {
      return numSeats;
   }
   
   public String toString()
   {
       return make + " -> " + numSeats;
   }
}
