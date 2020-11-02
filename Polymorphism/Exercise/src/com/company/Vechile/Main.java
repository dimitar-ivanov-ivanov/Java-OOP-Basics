package com.company.Vechile;

import com.company.Vechile.Models.Bus;
import com.company.Vechile.Models.Car;
import com.company.Vechile.Models.Truck;
import com.company.Vechile.Models.Vechile;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        List<Vechile> vehicles = getVehicles(scanner);
        processVehicleCommands(scanner, vehicles);
        printRemainingFuel(vehicles);
    }

    private static List<Vechile> getVehicles(Scanner scanner) {
        List<Vechile> vehicles = new ArrayList<>();
        vehicles.add(getCar(scanner));
        vehicles.add(getTruck(scanner));
        vehicles.add(getBus(scanner));
        return vehicles;
    }

    private static void printRemainingFuel(List<Vechile> vechiles) {
        DecimalFormat df = new DecimalFormat("0.00");

        for (Vechile vehicle :
                vechiles) {
            System.out.println(vehicle.getClass().getSimpleName() + ": " + df.format(vehicle.getFuelQuantity()));
        }
    }

    private static void processVehicleCommands(Scanner scanner, List<Vechile> vechiles) {
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] args = scanner.nextLine().split(" ");
            String command = args[0];
            String vehicleName = args[1];
            double val = Double.parseDouble(args[2]);

            if (command.equals("Drive")) {
                if (vehicleName.equals("Car")) {
                    driveVehicles(vechiles.get(0), val);
                } else if (vehicleName.equals("Truck")) {
                    driveVehicles(vechiles.get(1), val);
                } else if (vehicleName.equals("Bus")) {
                    driveVehicles(vechiles.get(2), val);
                }
            } else if (command.equals("Refuel")) {
                if (vehicleName.equals("Car")) {
                    refuelVehicles(vechiles.get(0), val);
                } else if (vehicleName.equals("Truck")) {
                    refuelVehicles(vechiles.get(1), val);
                } else if (vehicleName.equals("Bus")) {
                    refuelVehicles(vechiles.get(2), val);
                }
            } else if (command.equals("DriveEmpty") && vehicleName.equals("Bus")) {
                 //Add driveempty method
            }
        }
    }

    private static void refuelVehicles(Vechile vechile, double val) {
        try {
            vechile.refuel(val);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void driveVehicles(Vechile vechile, double val) {
        try {
            if (vechile.drive(val)) {
                System.out.println(vechile.getClass().getSimpleName() + " travelled " + val + " km");
            } else {
                System.out.println(vechile.getClass().getSimpleName() + " needs refueling");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Truck getTruck(Scanner scanner) {
        while (true) {
            try {
                String[] args = scanner.nextLine().split(" ");
                return new Truck(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Integer.parseInt(args[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static Car getCar(Scanner scanner) {
        while (true) {
            try {
                String[] args = scanner.nextLine().split(" ");
                return new Car(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Integer.parseInt(args[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static Bus getBus(Scanner scanner) {
        while (true) {
            try {
                String[] args = scanner.nextLine().split(" ");
                return new Bus(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Integer.parseInt(args[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
