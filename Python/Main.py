from Memory import Memory

# buat objek 
klasifikasi = Memory()

#set atribut
klasifikasi.setidProduct("1019")
klasifikasi.setPrice("4000000")
klasifikasi.setBrand("Oppo")
klasifikasi.setModel("A15")
klasifikasi.setFrequency("3 Ghz")
klasifikasi.setMemorySize("8 GB")
klasifikasi.setSupportsCuda("RTX")

#output
print("======= Klasifikasi =======")
print("ID Product : " + str(klasifikasi.getidProduct()))
print("Price : " + str(klasifikasi.getPrice()))
print("Brand : " + str(klasifikasi.getBrand()))
print("Model : " + str(klasifikasi.getModel()))
print("Frequency Memory : " + str(klasifikasi.getFrequency()))
print("Memory Size : " + str(klasifikasi.getMemorySize()))
print("Support Cuda : " + str(klasifikasi.getSupportsCuda()))
print("===========================")