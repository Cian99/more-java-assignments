# Appliances Project

## Project Overview
This project demonstrates object-oriented programming principles in Java by modeling various household appliances. It showcases inheritance, abstraction, interfaces, and polymorphism through a hierarchy of appliance classes.

## Key Components

1. `Appliance` (Abstract Class):
   - Base class for all appliances
   - Contains common properties like max watts and power status
   - Defines abstract methods for turning on/off

2. Specific Appliance Classes:
   - `Toaster`: Extends Appliance, adds number of slices and mode
   - `VacuumCleaner`: Extends Appliance, adds power level
   - `Fridge`: Extends Appliance, adds door status and defrost mode
   - Each class overrides toString() for custom output

3. `remoteControl` (Interface):
   - Defines methods for user alerts and status updates
   - Implemented by the Fridge class

4. `ApplianceTester`:
   - Main class to demonstrate the functionality of the appliance classes
   - Creates instances of each appliance type and sets their properties
   - Displays information about each appliance

## Key Features
- Inheritance hierarchy with Appliance as the base class
- Abstraction through the abstract Appliance class
- Interface implementation (remoteControl) for additional functionality
- Polymorphism demonstrated in the ApplianceTester class
- Encapsulation with private fields and public methods

## Project Structure
- `Appliance.java`: Abstract base class
- `Toaster.java`: Toaster implementation
- `VacuumCleaner.java`: Vacuum cleaner implementation
- `Fridge.java`: Refrigerator implementation
- `remoteControl.java`: Interface for remote-controlled appliances
- `ApplianceTester.java`: Main class for testing and demonstration

This project serves as a practical example of object-oriented design principles in Java, showing how different types of appliances can be modeled and managed in a structured, extensible manner.