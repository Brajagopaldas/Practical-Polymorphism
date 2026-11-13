class Game {
    void play() {
        System.out.println("Playing a game");
    }
}

class Cricket extends Game {
    void play() {
        System.out.println("Playing Cricket");
    }
}

class Football extends Game {
    void play() {
        System.out.println("Playing Football");
    }
}

class Hockey extends Game {
    void play() {
        System.out.println("Playing Hockey");
    }
}

class Main18 {
    public static void main(String[] args) {
        Game g;

        g = new Game();
        g.play();

        g = new Cricket();
        g.play();

        g = new Football();
        g.play();

        g = new Hockey();
        g.play();
    }
}
