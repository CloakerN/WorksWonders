fun main() {
    val numberToGuess = (1..100).random() // Random number between 1 and 100
    var attempts = 0
    var guessedCorrectly = false

    println("Welcome to the Number Guessing Game!")
    println("I have chosen a number between 1 and 100. Can you guess it?")

    while (!guessedCorrectly) {
        print("Enter your guess: ")
        val userInput = readLine()?.toIntOrNull()

        if (userInput == null) {
            println("Please enter a valid number.")
            continue
        }

        attempts++

        when {
            userInput < numberToGuess -> println("Too low! Try again.")
            userInput > numberToGuess -> println("Too high! Try again.")
            else -> {
                println("Congratulations! You guessed the number in $attempts attempts.")
                guessedCorrectly = true
            }
        }
    }
}