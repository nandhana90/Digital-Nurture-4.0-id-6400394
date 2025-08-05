import React, {Component} from 'react';
class Countpeople extends Component{
    constructor(props)
    {
        super(props);
        this.state = {
            entryCount:0,
            exitcount:0

        };
    }
    UpdateEntry = () => {
        this.setState((prevState)=>(
            {
                entryCount:prevState.entryCount+1
            }
        ));
    };

    UpdateExit = () =>{
        this.setState((prevState)=>
        (
            {
                exitcount:prevState.exitcount+1
            }
        ));
    };

    render()
    {
        return(
            <div style={{Height:'100vh',backgroundColor:'black',width:'100%'}}>
            <div style={{textAlign:'center',backgroundColor:'black',color:'white'}}>
                <h1>People Entered : {this.state.entryCount}</h1>
                <h2>People Excit : {this.state.exitcount}</h2>
                <button onClick={this.UpdateEntry} style={{margin:'10px',padding:'10px 20px', borderradius:'2px',color:'red',backgroundColor:'pink'}}>
                      Entry
                </button>
                <button onClick={this.UpdateExit} style={{margin:'10px',padding:'10px 20px',color:'green'}}>
                      Exit
                </button>
</div>
            </div>
        );
    }
}
export default Countpeople;
