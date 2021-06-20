w = int(input("vazn(kg) : "))
h = float(input("ghad(m) : "))

bmi = ( w / (h*h) )
print("bmi:")
print(bmi)

status = ""
if bmi <= 18.5 :
    status="kambood vazn"

elif bmi < 24.9:
    status="vazn monaseb"

elif bmi < 29.9 :
    status="ezafe vazn"

else:
    status = "chagh"

print(status)
