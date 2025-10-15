public class A1main{
public static void main(String[] args) {
   Player player = new Player("Arthur", 100);
   // Valid companion
   Companion companion1 = new Companion("Merlin", "Mage", 80, player);
   System.out.println(companion1);
   7
   // Companion{name='Merlin', role='Mage', power=80, owner=Arthur}
   System.out.println(companion1.useAbility());
   // Mage casts a fireball!
   // Invalid name
   Companion companion2 = new Companion("", "Warrior", 50, player);
   // Output: Error: Companion name cannot be null or empty
   // Output: Warning: Default values assigned for invalid inputs.
   System.out.println(companion2);
   // Companion{name='Unknown', role='Warrior', power=50, owner=Arthur}
   // Invalid role
   Companion companion3 = new Companion("Lancelot", "", 70, player);
   // Output Error: Companion role should be a Mage, Warrior, or Healer
   // Output: Warning: Default values assigned for invalid inputs.
   System.out.println(companion3);
   // Companion{name='Lancelot', role='Unknown Role Type', power=70, owner=Arthur}
   System.out.println(companion3.useAbility());
   // Output: Lancelot rolls around on the ground...
   // Invalid power
   Companion companion4 = new Companion("Galahad", "Healer", 150, player);
   // Output: Error: Power must be between 1 and 100
   // Output: Warning: Default values assigned for invalid inputs.
   System.out.println(companion4);
   // Companion{name='Galahad', role='Healer', power=1, owner=Arthur}
   // Null owner
   Companion companion5 = new Companion("Tristan", "Mage", 60, null);
   // Output: Error: Companion must be assigned to a valid Player
   // Output: Warning: Default values assigned for invalid inputs.
   System.out.println(companion5);
   // Companion{name='Tristan', role='Mage', power=60, owner=Default Player}
   }
   }