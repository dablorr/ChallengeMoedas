package com.dablorr;

import com.dablorr.GUI.Window;
import com.formdev.flatlaf.FlatDarkLaf;

import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
                FlatDarkLaf.setup();
                new Window();
        }
}