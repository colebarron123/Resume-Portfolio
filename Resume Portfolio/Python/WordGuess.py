#Cole Barron
#This is a program I wrote in Summer 2024 thats a word guessing game.
#The word is hardcoded and the game is similar to hangman!

wordToGuess = "fox"
guessStr = " " * len(wordToGuess)

def main():
    ltrsGuessed = []

    while guessStr != wordToGuess:
        print("Word: " + guessStr)
        usrInput = input("Enter a letter to guess: ").lower()
        if usrInput not in ltrsGuessed:
            ltrsGuessed.append(usrInput)

        guessLetter(usrInput)
        print("\nYou guessed: ", *ltrsGuessed)

    print("You guessed the word! The word was: " + wordToGuess)

def guessLetter(ltr):
    global guessStr
    res = ""
    if ltr in wordToGuess:
        print("Your letter was found in the word!")

        for i in range(len(wordToGuess)):
            if wordToGuess[i] == ltr:
                res = res + ltr
            else:
                res = res + guessStr[i]

        guessStr = res
    else:
        print("Your guess wasn't in the word. Try again!")

if __name__ == '__main__':
    main()