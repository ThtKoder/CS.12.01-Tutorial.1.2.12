public class Successors {

    public static Position findPosition(int integer, int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                if(arr[i][j] == integer){
                    return new Position(i,j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] returnArr = new Position[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j]+1;
                returnArr[i][j] = findPosition(value, arr);
            }
        }

        return returnArr;
    }

}
