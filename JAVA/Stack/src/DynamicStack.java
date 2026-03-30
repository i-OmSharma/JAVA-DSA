public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous item in new data
            for (int i = 0; i< data.length; i++) {
                temp[i] = data[i];
            }
            //System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
        //at this point we kno array is not full
        //insert item

        return super.push(item);
    }
}
