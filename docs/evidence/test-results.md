# Results of Testing

The test results show the actual outcome of the testing, following the [Test Plan](test-plan.md)

---

## Input Player Names and Symbols - VALID

I will test that players can enter a name, symbol and it is accepted

### Test Data Used

I will try to enter a valid, non-blank name: Trinh, Zeb and valid number of symbol: 2,3

### Test Result

![name-and-symbol-test.gif](screenshots/name-and-symbol-test.gif)

The test passed - only the valid names and symbols were accepted

---

## Input: Player Names and Symbols - INVALID

I will test that invalid (blank) names and symbols are rejected.

### Test Data To Use

I will try to enter a blank name and blank number of symbol and the invalid number for each player.

### Test Result

![name-and-symbol-test.gif](screenshots/name-and-symbol-test.gif)

The test passed - the blank names, blank number and invalid number of symbols were rejected.

---

## Input: Player Counter Selection - VALID

I will test that players can select counters

### Test Data To Use

I will attempt to enter a valid counter number

I will do this for player 1 and player 2

### Test Result

![counter-place-test.gif](screenshots/counter-place-test.gif)
The test passed - the counters were selected and moved

---

## Input: Player Counter Selection - BOUNDARIES

I will test the boundaries of the counter input

### Test Data To Use

I will attempt to select counters at position 1 and position 16, the boundaries of the board

I will do this for player 1 and player 2

### Test Result

![](screenshots/counter-place-test.gif)

The test passed - the counters in positions 1 and 16 were selected ok

---

