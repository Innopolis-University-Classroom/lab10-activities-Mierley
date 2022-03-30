package ru.innopolis.problem1;

// your solution here
//fix all the errors including package errors

public class ShapeFactory
{
    public Shape getShape(ShapeType type)
    {
        Shape returnObject = null;
        switch (type) {
            case CIRCLE:
                returnObject = new Circle();
            break;
                case RECTANGLE:
                returnObject = new Rectangle();
                break;
            case SQUARE:
                returnObject = new Square();
        }
        return returnObject;

    }
}

