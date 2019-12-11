package agh.cs.project1;

public class World {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("program <config.json> <number_of_animals");
            System.exit(1);
        }
        try {
            Config.init(args[0]);
            EvolutionMap map = new EvolutionMap();
            for(int j = 0; j<Integer.parseInt(args[1]); j++){
                new Animal(map, map.getRandomFreePosition());
            }
            MapSwingVisualizer sim = new MapSwingVisualizer(map,50);
            sim.startSimulation();
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }

    }

}
