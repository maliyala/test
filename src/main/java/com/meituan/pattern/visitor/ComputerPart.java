package com.meituan.pattern.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
