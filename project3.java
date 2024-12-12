import java.util.Scanner;

public class project3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Input The number Of balance");
        int balance = input.nextInt();

        System.out.println("");
        String[][] drinks = { {"1. Americano - $5", " 2. White Latte - $7", " 3. Black Coffee - $3"}, {"4. Brown Coffee - $4", " 5. Cream Latte - $8", " 6. Matcha Latte - $9"} };
        
        int o = 0;
        while (o < drinks.length) {
            int p = 0;
            while (p < drinks[o].length) {
                System.out.print(drinks[o][p] + " ");
                p++;
            }
            System.out.println();
            o++;
        }
        
        System.out.println("Please Choose the drink you want to order");
        System.out.println("");

        int buy = input.nextInt(); 
        int calculate = 0;
        int price = 0;

        while (true) {
        if (buy == 1) {
            price = 5;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[0][0] + " with reamaining amount of $" + calculate);
        } else if (buy == 2) {
            price = 7;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[0][1] + " with reamaining amount of $" + calculate);
        } else if (buy == 3) {
            price = 3;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[0][2] + " with reamaining amount of $" + calculate);
        } else if (buy == 4) {
            price = 4;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[1][0] + " with reamaining amount of $" + calculate);
        } else if (buy == 5) {
            price = 8;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[1][1] + " with reamaining amount of $" + calculate);
        } else if (buy == 6) {
            price = 9;
            calculate = balance - price;
            if (balance < price) {
            System.out.println("Sorry, you do not have enough money, your balance amount is $" + balance);
            return;
        }
            System.out.println("Your order is " + drinks[1][2] + " with reamaining amount of $" + calculate); 
        } else {
            System.out.println("Please input again.");
            return;
        }
        break;
        }

        System.out.println("");
        System.out.println("Thank you for your Purchase, Do you want to buy anything else? \r\n1. Yes \r\n2. No");
        System.out.println("");
        
        int choose = input.nextInt();
        while (true) {
            while (choose == 1) {

                System.out.println("What do you want to Add? \r\n1. Drink \r\n2. Food");
                System.out.println("");
                int categorychoice = input.nextInt();
                
            while (categorychoice == 1) { // DRINK
                
                if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                }

                String[] drinks2 = new String[6];
                drinks2[0] = "1. Jasmine Tea - $4";
                drinks2[1] = "2. Green Tea - $11";
                drinks2[2] = "3. Lemon Tea - $6";
                drinks2[3] = "4. peach Tea - $6";
                drinks2[4] = "5. Matcha - $13";
                drinks2[5] = "6. Milk Tea - $9";
                System.out.println(drinks2[0]);
                System.out.println(drinks2[1]);
                System.out.println(drinks2[2]);
                System.out.println(drinks2[3]);
                System.out.println(drinks2[4]);
                System.out.println(drinks2[5]);

                int price2 = 0;
                int second = input.nextInt();
                if (second == 1) {
                    price2 = 4;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[0] + ", Your remaining amount is $" + calculate);
                } else if (second == 2) {
                    price2 = 11;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[1] + ", Your remaining amount is $" + calculate);
                } else if (second == 3) {
                    price2 = 6;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[2] + ", Your remaining amount is $" + calculate);
                } else if (second == 4) {
                    price2 = 6;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[3] + ", Your remaining amount is $" + calculate);
                } else if (second == 5) {
                    price2 = 13;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[4] + ", Your remaining amount is $" + calculate);
                } else if (second == 6) {
                    price2 = 9;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + drinks2[5] + ", Your remaining amount is $" + calculate);
                } else {
                    System.out.println("Please input the right number.");
                }
                calculate = price + price2;
                System.out.println("Your Total amount of purchase is $" + calculate);
                System.out.println("Thank You For Purchasing");
                break;
            }

            while (categorychoice == 2) { //FOOD

                
                System.out.println("What kind of food do you want to add? \r\n1. Salty \r\n2. Sugary");
                System.out.println("");
                int categorychoice2 = input.nextInt();

                while (categorychoice2 == 1) {

                if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                }

                String[][][] foods = {{{"Salty Food"}, {"1. Beef Sandwich - $14"}, {"2. Butter Croissant - $10"}, {"3. Spaghetti Bolognese - $22"}, 
                {"4. Spaghetti Carbonara - $25"}, {"5. French Fries - $6"}, {"6. Classic Tuna Toast - $15"}}};

                int k = 0;
                while (k < foods.length) {
                    int s = 0;
                    while (s < foods[k].length) {
                        int p = 0;
                        while (p < foods[k][s].length) {
                            System.out.print(foods[k][s][p] + " ");
                            p++;
                        }
                        System.out.println();
                        s++;
                    }
                    System.out.println();
                    k++;
                }

                int price2 = 0;
                int second = input.nextInt();
                if (second == 1) {
                    price2 = 14;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][1][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 2) {
                    price2 = 10;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][2][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 3) {
                    price2 = 22;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][3][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 4) {
                    price2 = 25;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][4][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 5) {
                    price2 = 6;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][5][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 6) {
                    price2 = 15;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods[0][6][0] + ", Your remaining amount is $" + calculate);
                }else {
                    System.out.println("Please input the right number.");
                }
                calculate = price + price2;
                System.out.println("Your Total amount of purchase is $" + calculate);
                System.out.println("Thank You For Purchasing");
                break;
            }
        
            while (categorychoice2 == 2) {
                
                if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                }

                String[][][] foods2 = {{{"Sugary Food"}, {"1. Cinnamon Roll - $10"}, {"2. Choco Brownies - $15"}, {"3. Red Velvet - $16"}, 
                {"4. Cheese Cake - $15"}, {"5. Classic Tiramisu - $17"}, {"6. Classic Pancake - $10"}}};

                int t = 0;
                while (t < foods2.length) {
                    int s = 0;
                    while (s < foods2[t].length) {
                        int p = 0;
                        while (p < foods2[t][s].length) {
                            System.out.print(foods2[t][s][p] + " ");
                            p++;
                        }
                        System.out.println();
                        s++;
                    }
                    System.out.println();
                    t++;
                }

                int price2 = 0;
                int second = input.nextInt();

                 if (second == 1) {
                    price2 = 10;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][1][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 2) {
                    price2 = 15;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][2][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 3) {
                    price2 = 16;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][3][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 4) {
                    price2 = 15;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][4][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 5) {
                    price2 = 17;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][5][0] + ", Your remaining amount is $" + calculate);
                } else if (second == 6) {
                    price2 = 10;
                    calculate = calculate - price2;
                    if (calculate <= 0) {
                    System.out.println("Sorry, you do not have enough money");
                    System.out.println("Thank You For Purchasing");
                    return;
                    }
                    System.out.println("You add " + foods2[0][6][0] + ", Your remaining amount is $" + calculate);
                } else {
                    System.out.println("Please input the right number.");
                }
                calculate = price + price2;
                System.out.println("Your Total amount of purchase is $" + calculate);
                System.out.println("Thank You For Purchasing");
                break;
            }
            break;
        }
        break;
    }

            while (choose == 2) {
                System.out.println("Thank You For Purchasing");
                break;
            }
            break;
        }
    }
}
