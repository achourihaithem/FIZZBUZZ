# FIZZBUZZ
## Classic Fizz Buzz
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”.

ex output:
```sh
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
```
## Goal
We'll be slightly modifying FizzBuzz to build a more flexible program. The key difference is our FizzBuzz will accepts five parameters : three integers int1, int2 and limit, and two strings str1 and str2, allowing for any range of numbers we wish.

## Screenshots

![Alt firstSceen](https://github.com/achourihaithem/FIZZBUZZ/blob/master/screenshots/first_screen.jpg?raw=false)
![Alt secondScreen](https://github.com/achourihaithem/FIZZBUZZ/blob/master/screenshots/second_screen.jpg?raw=false)

## Project Architecture
![MVVM](https://user-images.githubusercontent.com/1812129/68319232-446cf900-00be-11ea-92cf-cad817b2af2c.png)

Model-View-ViewModel (ie MVVM) is a template of a client application architecture, proposed by John Gossman as an alternative to MVC and MVP patterns when using Data Binding technology. MVVM suggests separating the data presentation logic(Views or UI) from the core business logic part of the application
The separate code layers of MVVM are:
- Model: This layer is responsible for the abstraction of the data sources. Model and ViewModel work together to get and save the data.
- View: The purpose of this layer is to inform the ViewModel about the user’s action. This layer observes the ViewModel and does not contain any kind of application logic.
- ViewModel: It exposes those data streams which are relevant to the View. Moreover, it serves as a link between the Model and the View.

**MVVM Best Pratice:**
- Avoid references to Views in ViewModels.
- Instead of pushing data to the UI, let the UI observe changes to it.
- Distribute responsibilities, add a domain layer if needed.
- Add a data repository as the single-point entry to your data.
- Expose information about the state of your data using a wrapper or another LiveData.
- Consider edge cases, leaks and how long-running operations can affect the instances in your architecture.
- Don’t put logic in the ViewModel that is critical to saving clean state or related to data. Any call you make from a ViewModel can be the last one.


## Project Structure

1. **data**: It contains all the data accessing and manipulating components.
2. **presentation**: View classes along with their corresponding ViewModel.
3. **utils**: Utility classes.


## Libraries Used

* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way
* [Truth](https://truth.dev/) - Truth is a library for performing assertions in tests.
* [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - allows you to more easily write code that interacts with views.


## to be added
- Add local database
- Improve design
- dependency injection
