package com.sheepfly.chapter2.part2.section3;

import com.sheepfly.chapter2.part2.section2.Computer;
import com.sheepfly.chapter2.part2.section2.PersonComputer;

public class PersonComputerFactory implements ComputerFactory {
    @Override
    public Computer create() {
        return new PersonComputer();
    }
}
