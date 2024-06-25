package miniproject1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone {
	private String name;
    private String hp;
    private String companyNumber;

    public Phone(String name, String hp, String companyNumber) {
        this.name = name;
        this.hp = hp;
        this.companyNumber = companyNumber;
    }
    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }
    @Override
    public String toString() {
        return name + ", " + hp + ", " + companyNumber;
    }
}
