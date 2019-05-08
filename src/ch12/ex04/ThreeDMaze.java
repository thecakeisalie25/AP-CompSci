package ch12.ex04;
        
import java.util.Scanner;
        
public class ThreeDMaze
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        
        char[][][] maze =
        {
            {
                {'.', '.', '.', '.'},
                {'#', '#', '#', '.'},
                {'#', '.', '#', '.'},
                {'#', '.', '#', '.'},
                {'#', '.', '.', '.'}
            },
            {
                {'#', '#', '#', '#'},
                {'#', '#', '#', '#'},
                {'#', '.', '.', '#'},
                {'#', '.', '#', '#'},
                {'#', '#', '#', '#'}
            },
            {
                {'.', '.', '.', '.'},
                {'.', '#', '#', '#'},
                {'.', '#', '.', '#'},
                {'.', '#', '.', '#'},
                {'.', '.', '.', '#'}
            },
            {
                {'#', '#', '#', '.'},
                {'.', '.', '#', '.'},
                {'.', '.', '#', '.'},
                {'.', '.', '#', '.'},
                {'.', '.', '#', '.'}
            },
            {
                {'.', '.', '.', '#'},
                {'#', '#', '.', '#'},
                {'.', '.', '.', '#'},
                {'#', '#', '#', '#'},
                {'.', '.', '.', '.'}
            },
            {
                {'.', '#', '#', '#'},
                {'#', '#', '#', '#'},
                {'#', '#', '#', '#'},
                {'#', '#', '#', '#'},
                {'#', '#', '#', '#'}
            },
            {
                {'.', '.', '.', '#'},
                {'.', '#', '#', 'E'},
                {'.', '.', '#', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '.'}
            }
        };

        System.out.println(solve(maze, 0, 0, 0)?"Maze solved.":"There is no valid solution.");
        
        // printMaze(maze);

        input.close();
    }

    private static void printMaze(char[][][] maze) {
        for (char[][] e : maze) {
            for (char[] f : e) {
                for (char g : f) {
                    System.out.print(g + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static boolean solve(char[][][] maze, int layer, int vertical, int horizontal) throws InterruptedException {
        Thread.sleep(200);
        try {
            maze[layer][vertical][horizontal] = maze[layer][vertical][horizontal];
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        if(maze[layer][vertical][horizontal] == '#')
        {
            return false;
        }
        if (maze[layer][vertical][horizontal] == '+') {
            return false;
        }
        if(maze[layer][vertical][horizontal] == 'E')
        {
            return true;
        }
        maze[layer][vertical][horizontal] = '+';
        System.out.println("-------------------------------------------");
        printMaze(maze);
        if (solve(maze, layer, vertical, horizontal + 1)) {
            return true;
        }
        else if (solve(maze, layer, vertical, horizontal - 1)) {
            return true;
        }
        else if (solve(maze, layer, vertical + 1, horizontal)) {
            return true;
        }
        else if (solve(maze, layer, vertical - 1, horizontal)) {
            return true;
        }
        else if (solve(maze, layer + 1, vertical, horizontal)) {
            return true;
        }
        else if (solve(maze, layer - 1, vertical, horizontal)) {
            return true;
        }
        maze[layer][vertical][horizontal] = '-';
        return false;
    }
}