from Hardware import Hardware

class Memory(Hardware):
    #atribut
    __frequency = ""
    __memorySize = ""
    __supportsCuda = ""

    #constructor
    def __init__(self):
        self.__frequency = ""
        self.__memorySize = ""
        self.supportsCuda = ""

    #get set
    def setFrequency(self, frequency):
        self.__frequency = frequency
    def getFrequency(self):
        return self.__frequency

    def setMemorySize(self, memorySize):
        self.__memorySize = memorySize
    def getMemorySize(self):
        return self.__memorySize

    def setSupportsCuda(self, supportsCuda):
        self.__supportsCuda = supportsCuda
    def getSupportsCuda(self):
        return self.__supportsCuda