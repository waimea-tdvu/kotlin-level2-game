# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Input Player Names and Symbols - VALID

I will test that players can enter a name, symbol and it is accepted

### Test Data Used

I will try to enter a valid, non-blank name: Trinh, Zeb and valid number of symbol: 2,3

### Expected Test Result

The game should accept the non-blank names

---

## Input: Player Names and Symbols - INVALID

I will test that invalid (blank) names and symbols are rejected.

### Test Data To Use

I will try to enter a blank name and blank number of symbol and the invalid number for each player.

### Expected Test Result

The game should reject the blank names

---

## Input: Player Counter Selection - VALID

I will test that players can select counters

### Test Data To Use

I will attempt to enter a valid counter number

I will do this for player 1 and player 2

### Expected Test Result

The counters should be selected and moved

---

## Input: Player Counter Selection - BOUNDARIES

I will test the boundaries of the counter input

### Test Data To Use

I will attempt to select counters at position 1 and position 12, the boundaries of the board

I will do this for player 1 and player 2

### Expected Test Result

The inputs should be accepted

---

## Input: Player Counter Selection - INVALID

I will test that invalid counter inputs are rejected

### Test Data To Use

I will attempt to:

- Enter a blank
- Enter a word: **boy**
- Enter a number that is out of range: **0, 13**
- Enter a valid number in range, but no counter there

I will do this for player 1 and player 2

### Expected Test Result

All the input should be rejected

---

## Gameplay: Explosion

I will test that is the counter will remove if it has 3 or more counter adjacent.

### Test Data To Use

I will attempt to:

- Enter 3 counters adjacent
- Enter 4 counters adjacent
- Enter 5 counters adjacent
  I will do this for both player

### Expected Test Result

All the counters adjacent should be removed and replace with EMPTY for both players

---

## Gameplay: Win and Score

I will test that is the game count the score of each player and is the score win work

### Test Data To Use

I will attempt to:

- Check if the score count work
- Check if the winning work

I will do this for player 1 and player 2

### Expected Test Result

The game should be worked, count the score and player can win


