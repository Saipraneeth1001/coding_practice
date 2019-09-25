# this program helps us to merge two sorted arrays in the sorted order , the logic describes the larger
# elements to the last of the first array , if the print statements are left like that u can know the 
# functioning of the program in the clear way..


def sorted_merge(a,b,l1,l2):
    
    last = l1+l2-1
    ind1 = l1-1
    ind2 = l2-1
    while(ind2>=0):
        
        if(a[ind1] > b[ind2] and ind1>=0):
            
            a[last] = a[ind1]
            ind1-=1
            print(a)
        else:
            a[last] = b[ind2]
            ind2-=1
            print(a)
        last -= 1
    print(a)

a = [1,2,4,6,8,9,0,0,0]
b=[3,5,7]

sorted_merge(a,b,6,3)
