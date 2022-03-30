package ru.innopolis.problem2;

public class Burger {
    private Cheese cheese;
    private Peperone peperone;
    private Letucci letucci;
    private Tomato tomato;
    private SizeType size;

    public class BurgerBuilder {
        private Burger newBurger;

        BurgerBuilder() {
            newBurger = new Burger();
        }

        public BurgerBuilder withCheese(Cheese cheese)
        {
            newBurger.cheese = cheese;
            return this;
        }

        public BurgerBuilder withTomato(Tomato tomato)
        {
            newBurger.tomato = tomato;
            return this;
        }
        public BurgerBuilder withLetucci(Letucci letucci)
        {
            newBurger.letucci = letucci;
            return this;
        }
        public BurgerBuilder withPeperone(Peperone peperone)
        {
            newBurger.peperone = peperone;
            return this;
        }
        public BurgerBuilder withSize(SizeType size)
        {
            newBurger.size = size;
            return this;
        }

        public Burger build ()
        {
            return newBurger;
        }
    }

}
