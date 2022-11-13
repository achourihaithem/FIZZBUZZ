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
# Project Architecture

### Communication between layers
1. UI calls method from ViewModel.
2. ViewModel executes Use case.
3. Use case executes one or multiple Repositories function.
4. The Repository returns data from one or multiple Data Sources. the repository is the single source of truth
5. Information flows back to the UI where we display the data fetched from data sources.

I made a diagram to show the flow of the data between the three layers(data, domain , presentation)
![data flow diagram](screenshots/dataFlowDiagram.png )

# Project Structure
* Data
    * Would dispense the required data for the application to the domain layer 
      by implementing interface exposed by the domain
* Domain
    * This is the domain layer and consists of the domain model as well as the domain mapper
* UI
    * This is the presentation layer. I have set up packages by feature here. This consists of the view related code.
* DI
    * This is where Koin related code lives ,connected to the different layers of the application
* Utils
    * This is where most extension functions and constants and some other utils functions exist.


## Libraries Used

* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way
* [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - allows you to more easily write code that interacts with views.
* [Koin](https://insert-koin.io) - dependency injector
* [Espresso](https://developer.android.com/training/testing/espresso/) - UI test
* [Truth](https://github.com/google/truth) - Makes your test assertions and failure messages more readable


## to be added
- Save output history in a local database
- Improve design
 
