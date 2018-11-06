package assignment01;


public class Matrix {
  int numRows;
  int numColumns;
  int data[][];

  // Constructor with data for new matrix (automatically determines dimensions)
  public Matrix(int data[][]) {
    numRows = data.length; // d.length is the number of 1D arrays in the 2D array
    if (numRows == 0) {
      numColumns = 0;
    } else {
      numColumns = data[0].length; // d[0] is the first 1D array
    }
    this.data = new int[numRows][numColumns]; // create a new matrix to hold the data
    // copy the data over
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numColumns; j++) {
        this.data[i][j] = data[i][j];
      }
    }
  }

  @Override // instruct the compiler that we do indeed intend for this method to override
            // the superclass' (Object) version
  public boolean equals(Object other) {
    if (!(other instanceof Matrix)) { // make sure the Object we're comparing to is a Matrix
      return false;
    }
    Matrix matrix = (Matrix) other; // if the above was not true, we know it's safe to treat 'o' as a Matrix

    /*
     * TODO: replace the below return statement with the correct code, you must
     * return the correct value after determining if this matrix is equal to the
     * input matrix
     */
    
    //check each value for each row and column
    if(this.numRows == matrix.numRows && this.numColumns == matrix.numColumns) {
    	for(int i = 0; i < numRows; i++) {
    		for(int j = 0; j < numColumns; j ++) {
    			if(this.data[i][j] != matrix.data[i][j]) { // checking each element for equality
    				System.out.println("in loop returning false");
    				return false;
    			}
    		}
    	}
    } else {
    	return false;
    }
    
    return true; // placeholder
  }
  
  

  @Override // instruct the compiler that we do indeed intend for this method to override
            // the superclass' (Object) version
  public String toString() {
    /*
     * TODO: replace the below return statement with the correct code, you must
     * return a String that represents this matrix, as specified on the assignment
     * page
     */
	  
	  String matrixStr = "";
	  //loop through the rows
	  for(int i = 0; i < numRows; i++) {
		  for(int j = 0; j < numColumns; j++) {
			  matrixStr += data[i][j] + " ";
		  }
		  matrixStr += "\n";
	  }
	  //System.out.println(matrixStr);
	  return matrixStr; 
  }

  
  
  public Matrix times(Matrix matrix) {
    /*
     * TODO: replace the below return statement with the correct code, This function
     * must check if the two matrices are compatible for multiplication, if not,
     * return null. If they are compatible, determine the dimensions of the
     * resulting matrix, and fill it in with the correct values for matrix
     * multiplication
     */
	  
	  //check if its a legal matrix to times if not return null
	  if(this.numColumns != matrix.numRows) {
		  return null;
	  }
	  
	  Matrix resultMatrix = new Matrix(new int[numRows][matrix.numColumns]);
	  
	  for(int i = 0; i < numRows; i++) {
		  for(int j = 0; j < matrix.numColumns; j++) {
			  for(int k = 0; k < numColumns; k++) {
				  resultMatrix.data[i][j] += this.data[i][k] * matrix.data[k][j];
			  }
			//  System.out.println(newMatrix.data[i][j]);
//			  System.out.println((placeholder));
			  
		  }
	  }
	  
	  return resultMatrix; 
  }

  public Matrix plus(Matrix matrix) {
    /*
     * TODO: replace the below return statement with the correct code, This function
     * must check if the two matrices are compatible for addition, if not, return
     * null. If they are compatible, create a new matrix and fill it in with the
     * correct values for matrix addition
     */
	  
	  Matrix resultMatrix = new Matrix(new int[numRows][numColumns]);
	  
	  if(this.numRows != matrix.numRows || this.numColumns != matrix.numColumns) {
		  return null;
	  }
	  /* loop through the number of rows 
	   * loop through the number of columns
	   * store data from current column and row of this matrix + right hand side matrix - 
	   * in new matrix object 
	   * return that new object with new values populated
	   */
	  for(int i = 0; i < numRows; i++) { 
		  for(int j = 0; j < numColumns; j++) {
			  resultMatrix.data[i][j] = this.data[i][j] + matrix.data[i][j];
		  }
	  }
	  
	  
    return resultMatrix;
  }
}
