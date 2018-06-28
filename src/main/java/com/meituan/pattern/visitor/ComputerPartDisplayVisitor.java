package com.meituan.pattern.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.print("Displaying mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }
}
