public final class hso_ds {
   private int a = 0;
   private int b;
   private boolean c = false;

   public final void a(int var1) {
      this.a = var1;
      this.c = false;
      switch(this.a) {
      case 0:
         this.b = 4;
         return;
      case 1:
         this.b = 6;
         return;
      case 2:
         this.b = 12;
         return;
      case 5:
         this.b = 8;
         return;
      case 6:
         this.b = 30;
         this.c = true;
         return;
      case 7:
         this.b = 16;
         return;
      case 8:
         this.b = 10;
         return;
      case 10:
         this.b = 22;
         this.c = true;
         return;
      case 11:
         this.b = 11;
         this.c = true;
         return;
      case 16:
         this.b = 6;
         this.c = true;
      case 3:
      case 4:
      case 9:
      case 12:
      case 13:
      case 14:
      case 15:
      default:
      }
   }

   public final void a(MainObject var1) {
      label89: {
         switch(this.a) {
         case 3:
            if (var1.cP < 2) {
               var1.ce = 5;
               var1.dW = 4;
            } else {
               var1.i(1);
               var1.dW = var1.cP + 2;
               if (var1.cP < 6) {
                  var1.ce = 4;
               } else {
                  var1.cF = 0;
                  var1.ce = 0;
                  var1.ba = 0;
                  var1.dW = 0;
               }
            }
            break label89;
         case 4:
            if (var1.cP < 4) {
               var1.ce = 4;
               var1.dW = 4;
            } else {
               var1.i(1);
               var1.dW = var1.cP;
               if (var1.cP < 10) {
                  var1.ce = 5;
               } else {
                  var1.cF = 0;
                  var1.ce = 0;
                  var1.ba = 0;
                  var1.dW = 0;
               }
            }
            break label89;
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         default:
            if (var1.cP < this.b) {
               var1.ce = 4;
               if (this.c) {
                  var1.ce = 5;
               }

               var1.dW = 4;
               if (var1.dW > 4) {
                  var1.dW = 4;
               }
               break label89;
            }

            var1.i(1);
            var1.dW = var1.cP - (this.b - 4);
            if (var1.cP < this.b + 4) {
               var1.ce = 5;
               if (this.c) {
                  var1.ce = 4;
               }
               break label89;
            }
            break;
         case 9:
            if (var1.cP < 30) {
               var1.ce = 4;
               if (var1.bx == 3) {
                  var1.ce = 5;
               }

               var1.dW = 4;
            } else {
               var1.cF = 0;
               var1.ce = 0;
               var1.ba = 0;
               var1.dW = 0;
            }
            break label89;
         case 12:
            if (var1.cP < 30) {
               break label89;
            }
            break;
         case 13:
            if (var1.cP < 12) {
               var1.ce = 5;
               var1.dW = 4;
            } else if (var1.cP < 30) {
               if (var1.cP < 14) {
                  var1.dW = var1.cP - 8;
                  var1.ce = 4;
               } else if (var1.cP % 2 == 0) {
                  var1.i(1);
                  var1.dW = 4;
                  var1.ce = 5;
               } else {
                  var1.dW = 7;
                  var1.ce = 4;
               }
            } else {
               var1.cF = 0;
               var1.ce = 0;
               var1.ba = 0;
               var1.dW = 0;
            }
            break label89;
         case 14:
            if (var1.bx == 3) {
               if (var1.cP < 2) {
                  var1.ce = 5;
                  var1.dW = 4;
               } else {
                  var1.i(1);
                  var1.dW = var1.cP + 2;
                  if (var1.cP < 6) {
                     var1.ce = 4;
                  } else {
                     var1.cF = 0;
                     var1.ce = 0;
                     var1.ba = 0;
                     var1.dW = 0;
                  }
               }
            } else if (var1.cP < 4) {
               var1.ce = 4;
               var1.dW = 4;
            } else {
               var1.i(1);
               var1.dW = var1.cP;
               if (var1.cP < 8) {
                  var1.ce = 5;
               } else {
                  var1.cF = 0;
                  var1.ce = 0;
                  var1.ba = 0;
                  var1.dW = 0;
               }
            }
            break label89;
         case 15:
            if (var1.cP < 26) {
               var1.ce = 5;
               var1.dW = 4;
               if (var1.cP >= 12) {
                  var1.i(1);
               }
            } else if (var1.cP < 30) {
               var1.dW = var1.cP - 22;
               var1.ce = 4;
               if (var1.dW > 7) {
                  var1.dW = 7;
               }
            } else {
               var1.cF = 0;
               var1.ce = 0;
               var1.ba = 0;
               var1.dW = 0;
            }
            break label89;
         }

         var1.cF = 0;
         var1.ce = 0;
         var1.ba = 0;
         var1.dW = 0;
      }

      ++var1.cP;
   }
}
