### OrderReceipt
1. 神秘命名：将o改成order以提高可读性  
2. 死亡代码：将无用的方法printCustomerName删除以提高可读性  
3. 魔法数字：将.10抽取成常量，并赋予有意义的命名`TEN_PERCENT_TAX_RATE`  
4. 长方法：抽取方法并删除注释以提高可读性  
   抽取printHeaders方法
   抽取printCustomerInfo方法  
   抽取printStateTax方法  
   抽取printTotalAmount方法  
   抽取printLineItem方法  
   抽取calculateTotalAmountOfLineItem方法  
   抽取calculateToaltSalesTax方法  
   
### LineItem
1. 死亡代码：删除无用的super()
2. 神秘命名：将构造函数参数名p改成price以提高可读性 

### Order
1. 基本类型偏执：将customerName和address进一步封装成Customer对象，以提高代码拓展性
   
   
