
class Product:
    #atribut
    __price = 0
    __idProduct = 0

    #constructor
    def __init__(self):
        self.__price = 0
        self.__idProduct = 0
        
    #set get
    def setidProduct(self, idProduct):
        self.__idProduct = idProduct
    def getidProduct(self):
        return self.__idProduct

    def setPrice(self, price):
        self.__price = price
    def getPrice(self):
        return self.__price

    