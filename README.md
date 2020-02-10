# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

### Solution
The code for the same can be found in the "src" folder.

Additional explanation about the interface and implementation :
Interface :
com.paytmlabs.sdechallenge.calculateaverage.MovingAverage
This interface declares 3 methods to solve the question :
1) calculateMovingAverage - to calculate the moving average of last N numbers
2) addElement(T element) - to add element to the data structure
3) getElements() - to access all the elements added

This interface is created as a generic type where the implementation class can decide about the type of elements in wants to use and operate on.

Implementation :
com.paytmlabs.sdechallenge.core.MovingAverageImpl is the implementation class for MovingAverage.
This implementation is for the type Double.

The constructor tells the program that what would be the value for ’N’.
This is initialized in the drivers class - CalculateMovingAverage.java.

This class provides the definitions for all the 3 functions defined in the interface.These are as follows :
1) addElement() - This checks if the number to be added is not null, it will insert this number in the list.
Also, it keeps on calculating the sum of last N digits by subtracting the first element in the window of N size and then adding the new number that has been inserted.
2) getElements() - returns the list of all the elements that have been added
3) calculateMovingAverage() - if the size of the list is greater than or equal to ’N’, we divide the sum by N to get the average.
Otherwise, if the size of the list is less than N or N is not greater than zero, we return null.

------------------------------------------------------------------------------------------------------
## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.

### Solution

The solution design and explaination for this can be found in the pdf file - DesignQuestion-GoogleAnalyticsLikeSystem.pdf
