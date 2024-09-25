# Simple Bank Account System

This a simple version of a banking system that allows user to:

```1. Create accounts```

```2. Deposit```

```3. Withdraw```

```4. Check account Balance```

## Classes : ```attributes``` and ```Methods```

| Class          | Description                                             | Attributes                                                                    | Methods                                                                                                                       |
|----------------|---------------------------------------------------------|-------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| ```Main```     | The entry point for the system. Handles user input.     | ---                                                                           | ```main()```                                                                                                                  |
| ```Bank```     | Manages multiple bank accounts and performs operations. | ```String bankName``` ```ArrayList<Account> accounts``` ```Scanner scanner``` | ```Bank()``` ```addAccount()``` ```deposit()``` ```dithdraw()``` ```checkBalance()``` ```findAccount()``` ```getAccounts()``` |
| ```Account```  | Represents an individual bank account.                  | ```int accountNumber``` ```double balance```                                  | ```Account()``` ```deposit()``` ```dithdraw()``` ```getAccountNumber()``` ```getBalance``` ```toString()```                   |
| ```Customer``` | Represents a customer of the bank who owns an account.  | ```String name``` ```Account account```                                       | ```Customer()``` ```getName()``` ```getAccount()``` ```toString()``` ```setName()``` ```setAccount()```                       |



## Features
- Create an account
- Deposit and withdraw money
- Check account balance
